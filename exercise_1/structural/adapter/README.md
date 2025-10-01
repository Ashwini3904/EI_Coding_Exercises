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


## Output Screenshot

<img width="310" height="194" alt="output_ss_adapter" src="https://github.com/user-attachments/assets/96aeadb5-ed51-4818-ae50-5548ffd85fb6" />

