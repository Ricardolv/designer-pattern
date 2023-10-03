# **Designer Parttern**

---
### Creational Design Patterns:
#### Creational design patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

### Factory
#### Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

![Factory Method simple.](/assests/images/factory/iphone-simple.jpg)

![Factory Method halfSimple.](/assests/images/factory/iphone-halfSimple.jpg)

![Factory Method before.](/assests/images/factory/iphone-before.jpg)

![Factory Method after.](/assests/images/factory/iphone-after.jpg)

---
### Abstract Factory
#### Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

![Abastract Factory full](/assests/images/abstract-factory/iphone-full.jpg)

![Abastract Factory details](/assests/images/abstract-factory/iphone-details.jpg)

![Abastract Factory services](/assests/images/abstract-factory/services.jpg)

![Abastract Factory entityView](/assests/images/abstract-factory/services-entityView.jpg)

---
### Singleton
#### Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

![Singleton](/assests/images/singleton/connectionPool.jpg)

---
### Builder
#### Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

![Builder before](/assests/images/builder/meal-before.jpg)

![Builder after](/assests/images/builder/meal-after.jpg)

![Builder fluent](/assests/images/builder/meal-fluent.jpg)

![Builder functional](/assests/images/builder/meal-functional.jpg)

---
### Prototype
#### Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

![Prototype animation](/assests/images/prototype/animation.jpg)

![Prototype cloneBuilder](/assests/images/prototype/cloneBuilder.jpg)

![Prototype fluent](/assests/images/prototype/fluent.jpg)

---
### Structural Design Patterns: 
#### Structural design patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.

### Adapter
#### Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

![Adapter before](/assests/images/adapter/hdmi-before.jpg)

![Adapter after](/assests/images/adapter/hdmi-after.jpg)

![Adapter class](/assests/images/adapter/hdmi-class.jpg)

![Adapter hexagonal](/assests/images/adapter/hexagonal.jpg)

---
### Bridge
#### Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

![Bridge service before](/assests/images/bridge/services-before.jpg)

![Bridge service after](/assests/images/bridge/services-after.jpg)

![Bridge converter](/assests/images/bridge/converter.jpg)

---
### Composite
#### Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

![Composite folders](/assests/images/composite/folders.jpg)

![Composite swing](/assests/images/composite/swing.jpg)

---
### Decorator
#### Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

![Decorator coffeeshop](/assests/images/decorator/coffeeshop.jpg)

![Decorator swing](/assests/images/decorator/swing.jpg)

---
### Facade
#### Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.
![Facade before](/assests/images/facade/callCenter-before.jpg)

![Facade after](/assests/images/facade/callCenter-after.jpg)

![Facade isolated](/assests/images/facade/callCenter-isolated.jpg)

---
### Flyweight
#### Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

![Flyweight game map](/assests/images/flyweight/game-map.jpg)

![Flyweight before](/assests/images/flyweight/music-before.jpg)

![Flyweight after](/assests/images/flyweight/music-after.jpg)

---
### Proxy
#### Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

![Proxy atm](/assests/images/proxy/atm.jpg)

![Proxy resource](/assests/images/proxy/resource.jpg)

---
### Behavioral Design Patterns:
#### Behavioral design patterns are concerned with algorithms and the assignment of responsibilities between objects.

### Mediator
#### Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

![Mediator before](/assests/images/mediator/swing-before.jpg)

![Mediator after](/assests/images/mediator/swing-after.jpg)

![Mediator atm](/assests/images/mediator/translator.jpg)

---
### Chain of Responsibility
#### Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

![Chain before](/assests/images/chain/bills-before.jpg)

![Chain after](/assests/images/chain/bills-after.jpg)

![Chain services](/assests/images/chain/services.jpg)

---
### Reference:
[Baeldung](https://www.baeldung.com/design-patterns-series) <br/>
[Refactoring Guru](https://refactoring.guru/design-patterns) <br/>
[Cod3r](https://www.cod3r.com.br/courses/padroes-de-projeto)