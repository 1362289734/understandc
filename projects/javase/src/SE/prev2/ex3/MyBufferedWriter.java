package SE.prev2.ex3;

import java.io.IOException;
import java.io.Writer;

public class MyBufferedWriter extends Writer {
    //    private StringBuilder stringBuilder = new StringBuilder();
    private char[] buf = new char[1024];

    private int count;
    private Writer writer;

    public MyBufferedWriter(Writer writer) {
        this.writer = writer;
    }

    public void newLine() throws IOException {
        write('\n');
    }

    public void write(char c) throws IOException {
        if (count < 1024) {
            buf[count++] = c;
        } else {
            writer.write(buf);
        }
    }


    public static void main(String[] args) {


    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
    //重写write()方法,减少IO次数，提高运行的效率

        if (len > 1024 - count) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(buf, 0, count);
            stringBuilder.append(cbuf, off, len);
            writer.write(stringBuilder.toString());
        }else{
            System.arraycopy(cbuf,off,buf,count,len);
            count+=len;
        }
    }

    @Override
    public void flush() throws IOException {
        writer.write(buf,0,count);
        writer.flush();
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }
}
