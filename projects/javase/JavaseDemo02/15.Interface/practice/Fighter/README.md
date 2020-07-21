模拟两个人物进行攻击，人物可以装备武器，并且可以使用技能攻击

####人物类

##### 属性
- 姓名
- 血量 (1000起始值)
- 武器 (接口)
- 技能数组 (接口)
- 眩晕值
##### 方法
- public void attack(Fighter fighter)，方法参数为一个人物对象，表示向该人物发起攻击。攻击时从技能数组中随机选择一项技能进行方法调用，调用需要满足技能接口的方法声明
- public void hurt(int hurt), 方法接收一个数值作为受到伤害的数值，将会扣除血量值
- public void vertigo(int rounds)，受到眩晕伤害，增加眩晕值，眩晕值如果不为零则会跳过一个回合攻击
- public void recover()，从眩晕中恢复，眩晕值如果不为零则减一

#### 技能接口

##### 抽象方法
- 使用技能方法，接收两个人物类对象，分别是释放技能的人物和受到技能的人物

void apply(Fighter from, Fighter to);

##### 接口的实现类

- 双倍攻击技能
使用Fighter from的武器的attack() * 2，作为to 的受到的伤害

- 眩晕技能
使用Fighter from的武器伤害的 0.5，作为to受到的伤害，to会被眩晕一回合

#### 武器接口

##### 抽象方法

- String getName(); // 返回武器的名称
- int attack(); // 返回攻击伤害

##### 武器的实现类
- 倚天剑， attack 返回固定值 15
- 屠龙刀， attack 返回 20~30的随机数

#### 程序流程

创建出两个人物对象，给与不同的武器，给与技能列表，然后每回合相互进行攻击，直到一人血量小于0为止，输出结果如下
```
张无忌向灭绝师太发起双倍攻击！
灭绝师太受到伤害24
灭绝师太向张无忌发起眩晕攻击！
张无忌受到伤害7
张无忌眩晕1回合
灭绝师太向张无忌发起眩晕攻击！
张无忌受到伤害7
张无忌眩晕1回合
灭绝师太向张无忌发起双倍攻击！
张无忌受到伤害30
...略
灭绝师太被打败了
```

思考增加新的武器，增加新的技能，可以增加人物类的成员，例如增加魔法值，或者防具。 增加新的技能，需要耗费魔法值，或者可以破甲减少防御值。

至少增加一种武器，两种技能