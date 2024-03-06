# SpringExercises

## First part

* **Custom DI container (**[`customdicontainer`](src/main/java/com/springexercises/parta/customdicontainer)**)**\
  Lightweight DI container implementation.<br/><br/>

* **Conditional DI (**[`conditionaldi`](src/main/java/com/springexercises/parta/conditionaldi)**)**\
  Using `@Conditional` annotation to create special conditions for DI.<br/><br/>

* **ApplicationContext implementations (**[`beanconfig`](src/main/java/com/springexercises/parta/beanconfig)**)**\
  Using different implementations of `ApplicationContext` to work
  with various bean configurations.

## Second part

* **Alias redefinition (**[`aliasredefinition`](src/main/java/com/springexercises/partb/aliasredefinition)**)**\
  Implementation of a scenario in which beans with the same aliases are added to the 
  IoC container.<br/><br/>

* **Using aliases for DI (**[`aliasesdi`](src/main/resources/partb/aliasesdi)**)**\
  Demonstrates how bean aliases can be used to inject dependencies into other beans.
  <br/><br/>

* **Cyclic dependency detection (**[`cyclicdependency`](src/main/java/com/springexercises/partb/cyclicdependency)**)**\
  Using `depends-on` attribute to resolve cyclic dependency and ensure proper
  initialization order.<br/><br/>

* **Lazy loading with DI (**[`lazyinitdi`](src/main/java/com/springexercises/partb/lazyinitdi)**)**\
  Shows how lazy loading works in conjunction with dependency injection, all lazy
  bean dependencies are resolved only when needed.<br/><br/>

* **Nested dependencies with qualifiers (**[`qualifiersdi`](src/main/java/com/springexercises/partb/qualifiersdi)**)**\
  Using `@Qualifier` to specify which dependency should be injected into the bean.<br/><br/>

* **Caching aspect and proxy-based peculiarities (**[`cachingaspect`](src/main/java/com/springexercises/partb/cachingaspect)**)**\
  Implementation of a caching aspect with Spring AOP. Aspect caches method results
  based on specific conditions or annotations.\
  Also demonstrates some interesting points regarding the fact that Spring AOP is
  proxy-based.<br/><br/>

* **Validation aspect (**[`validationaspect`](src/main/java/com/springexercises/partb/validationaspect)**)**\
  Implementation of a validation aspect using Spring AOP. Aspect intercepts method
  call and validates input parameters against predefined rules. 