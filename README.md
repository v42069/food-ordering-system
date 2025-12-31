# 🍔 Food Ordering System (Java)

A simple Java-based food ordering system built to demonstrate **Clean Architecture** and **Domain Driven Design**.


---

## 📌 Overview

The system supports:

- Viewing a food menu
- Placing an order
- Calculating the total order cost


---

## 🧱 Architecture

This project follows **Clean Architecture** principles.

### Core Rule
> **All dependencies point toward the domain core.**

- Domain core has **zero external dependencies**
- Higher-level modules depend on domain abstractions
- Dependency inversion is enforced at build time

---

## 📊 Dependency Graph

The diagram below proves that all dependencies point toward the domain core.

![Dependency Graph](food-ordering-system/target/dependency-graph.png)

This confirms:
- Domain core is independent
- No outward dependencies
- Clean Architecture is actually applied

---

## 📦 Module Structure

### Domain Core
- Business entities (e.g. FoodItem, Order)
- Core business rules
- No frameworks
- No Maven dependencies

---

### Application Layer
- Use cases (place order, calculate total)
- Orchestrates domain logic
- Depends only on domain core

---

### Infrastructure Layer
- Technical implementations (future extensions)
- Depends on domain interfaces
- Replaceable without touching business logic


---

## 🚀 Build

```bash
mvn clean install
