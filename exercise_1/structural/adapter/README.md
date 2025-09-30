# Restaurant App 

## Overview

This project demonstrates the Adapter Structural Design Pattern in Java.

The restaurant originally uses a Basic App that works with XML data. To enhance the user experience, a Fancy UI (third-party library) was introduced, but it only accepts JSON data.

The Adapter bridges the gap, allowing the client to use FancyUI seamlessly with the existing XML data.


## Use Case: Restaurant Application

* A restaurant application maintains its menu data in XML format.The existing Basic Restaurant App consumes XML directly and shows the menu in a simple way.

* To enhance the user experience, the restaurant integrates a third-party Fancy UI library. However, this library expects data in JSON format instead of XML.

* Instead of rewriting the existing system or modifying the Fancy UI, an Adapter (FancyUIAdapter) is introduced.

  * **It converts XML data into JSON.**

  * **It allows the Fancy UI to display menus and recommendations without changing the core system.**

  * **Both the Basic App and the Fancy UI can now work seamlessly with the same XML menu data.**


## Why Adapter Design Pattern?

* The client expects to use the **RestaurantApp interface**.
* BasicRestaurantApp works with XML, but FancyUI requires JSON.
* The **Adapter converts XML to JSON and adapts the Fancy UI to work with the existing system.
* This allows both systems to work seamlessly without modifying existing code.


## File Explanations

**1. adaptee/FancyUI.java**

* Represents the new system that only works with JSON.
* Provides methods to display menu and recommendations in JSON format.

**2. adapter/FancyUIAdapter.java**

* Implements the RestaurantApp interface.
* Converts XML data into JSON before passing it to FancyUI.
* Bridges the gap between the existing XML-based app and the JSON-based UI.

**3. client/Client.java**

* Acts as the main program.
* Reads menu data from menu.xml.
* Demonstrates both the **BasicRestaurantApp (XML)** and the **FancyUIAdapter (JSON)** in action.

**4. target/RestaurantApp.java**

* Defines the **common interface** (showMenu, showRecommendations) expected by the client.
* Ensures both Basic and Fancy apps can be used interchangeably.

**5. target/BasicRestaurantApp.java**

* An existing implementation that consumes XML directly.
* Displays menu and recommendations in a simple format.

**6. menu.xml**

* Sample XML menu data used by the client and adapter.

