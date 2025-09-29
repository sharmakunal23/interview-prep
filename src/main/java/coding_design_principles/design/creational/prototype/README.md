
## Prototype Design Pattern

> The Prototype Design Pattern is a creational design pattern that lets you create new objects by cloning existing ones, instead of instantiating them from scratch.

It’s particularly useful in situations where:

- Creating a new object is expensive, time-consuming, or resource-intensive.
- You want to avoid duplicating complex initialization logic.
- You need many similar objects with only slight differences.

The Prototype Pattern allows you to create new instances by cloning a pre-configured prototype object, ensuring consistency while reducing boilerplate and complexity.

### A Quick Note on Cloning:

- **Shallow Copy**: This implementation performs a shallow copy. It’s fine if all fields are primitives or immutable (like String). But if Enemy had a field like a List, both the original and cloned enemies would share the same list object, which can cause subtle bugs.
- **Deep Copy**: If your object contains mutable reference types, you should create a deep copy in the copy constructor. For example:

```
this.inventory = new ArrayList<>();
for (Item item : source.inventory) {
this.inventory.add(item.clone()); // Assuming Item also implements clone()
}
```
Java’s built-in `Object.clone()` is often avoided due to its limitations and shallow behavior. Manual cloning using copy constructors or builders is more flexible and safer.