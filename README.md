# design-pattern
简介：学习设计模式的思想与练习.
### 1.原则

在软件设计中，有一些基本的设计原则，它们被认为是帮助开发者创建高质量、易维护、灵活和可扩展的软件的准则。以下是一些重要的设计原则：

1. **单一职责原则（Single Responsibility Principle - SRP）：**
   - 简单的来说就是一个类和方法只做一个事情
2. **开放封闭原则（Open/Closed Principle - OCP）：**
   - 抽象架构，扩展实现
3. **里氏替换原则（Liskov Substitution Principle - LSP）：**
   - 多态，子类可以扩展父类
4. **依赖倒置原则（Dependency Inversion Principle - DIP）：**
   - 细节依赖抽象，下层依赖上层
5. **接口隔离原则（Interface Segregation Principle - ISP）：**
   - 建立单一接口
6. **迪米特法则（Law of Demeter - LoD）：**
   - 最少知道，降低耦合
7. **合成/聚合复用原则（Composition/Aggregation Reuse Principle - CARP）：**
   - 首选使用合成/聚合，而不是继承来实现代码的重用。这样更加灵活，减少了类之间的紧耦合。

这些原则被认为是面向对象设计的基础，遵循这些原则有助于创建灵活、可维护和可扩展的软件系统。在实际的软件开发中，这些原则经常相互交叉应用，共同构建出高质量的软件架构。

### 2.分类

#### **1.创建型模式（Creational Patterns）：**

- 这类模式关注对象的创建机制，通过合适的方式创建对象，以满足不同场景的需求。包括：
  - **单例模式（Singleton Pattern）**
  
    保证一个类只有一个实例，并提供一个全局访问点。
  
  - **工厂模式（Factory Pattern）**
  
    定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
  
  - **抽象工厂模式（Abstract Factory Pattern）**
  
    提供一个接口，用于创建一系列相关或相互依赖的对象，而不需指定它们的具体类。
  
  - **建造者模式（Builder Pattern）**
  
    将一个复杂对象的构建与其表示分离，使得同样的构建过程可以创建不同的表示。
  
  - **原型模式（Prototype Pattern）**
  
    用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。

#### **2.结构型模式（Structural Patterns）：**

- 这类模式关注对象组合，以获得更复杂的结构。包括：
  - **适配器模式（Adapter Pattern）**
  - **桥接模式（Bridge Pattern）**
  - **装饰器模式（Decorator Pattern）**
  - **组合模式（Composite Pattern）**
  - **外观模式（Facade Pattern）**
  - **享元模式（Flyweight Pattern）**
  - **代理模式（Proxy Pattern）**

#### **3.行为型模式（Behavioral Patterns）：**

- 这类模式关注对象之间的通信、职责分配等行为。包括：
  - **模板方法模式（Template Method Pattern）**
  - **策略模式（Strategy Pattern）**
  - **命令模式（Command Pattern）**
  - **责任链模式（Chain of Responsibility Pattern）**
  - **状态模式（State Pattern）**
  - **观察者模式（Observer Pattern）**
  - **中介者模式（Mediator Pattern）**
  - **访问者模式（Visitor Pattern）**
  - **备忘录模式（Memento Pattern）**
  - **解释器模式（Interpreter Pattern）**

#### **4.并发型模式（Concurrency Patterns）：**

- 这类模式关注多线程和并发编程中的问题。包括：
  - **生产者-消费者模式（Producer-Consumer Pattern）**
  - **读者-写者模式（Reader-Writer Pattern）**
  - **线程池模式（Thread Pool Pattern）**

### 3.使用：

理解并且复用至项目当中即可。

### 4.引入：

大话设计模式【Java溢彩加强版】 (程杰)
重学java设计模式 (小傅哥) 

### 5.版权和许可：

项目根据Apache License 2.0生成
