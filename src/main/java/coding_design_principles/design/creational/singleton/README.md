
## Singleton Pattern

> Singleton Pattern is a creational design pattern that guarantees a class has only one instance and provides a global point of access to it.
> Example: thread pools, caches, loggers etc.

It involves only one class which is responsible for instantiating itself, making sure it creates not more than one instance.

To implement the singleton pattern, we must prevent external objects from creating instances of the singleton class. Only the singleton class should be permitted to create its own objects.

Additionally, we need to provide a method for external objects to access the singleton object.

### Real-World Examples of Singleton
#### Singleton is useful in scenarios like:

- **Managing Shared Resources** (database connections, thread pools, caches, configuration settings)
- **Coordinating System-Wide Actions** (logging, print spoolers, file managers)
- **Managing State** (user session, application state)

#### Specific Examples:

- **Logger Classes**: Many logging frameworks use the Singleton pattern to provide a global logging object. This ensures that log messages are consistently handled and written to the same output stream.
- **Database Connection Pools**: Connection pools help manage and reuse database connections efficiently. A Singleton can ensure that only one pool is created and used throughout the application.
- **Cache Objects**: In-memory caches are often implemented as Singletons to provide a single point of access for cached data across the application.
- **Thread Pools**: Thread pools manage a collection of worker threads. A Singleton ensures that the same pool is used throughout the application, preventing resource overuse.
- **File System**: File systems often use Singleton objects to represent the file system and provide a unified interface for file operations.
- **Print Spooler**: In operating systems, print spoolers manage printing tasks. A single instance coordinates all print jobs to prevent conflicts.