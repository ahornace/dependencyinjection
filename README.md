# Dependency Injection Framework

Your task is to implement a simple dependency injection framework. You will need to scan the classpath and find all 
classes with `@Singleton` annotation. These classes may contain attributes annotated with `@Inject` which represent
other singletons that your framework should create before and inject the instance to this field. 
