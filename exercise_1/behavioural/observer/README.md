# YouTube Notification System 

## Overview

This project demonstrates the Observer Behavioral Design Pattern in Java using a YouTube Notification system.

When a channel uploads a new video, all subscribed users (observers) are notified automatically.
Subscribers can also unsubscribe at any time and stop receiving updates.


## Use Case

A **YouTube channel system** where:

* **Channels (Subjects)** upload videos.
* **Subscribers (Observers)** get notified whenever a new video is uploaded.
* Subscribers can **subscribe/unsubscribe** dynamically.


## Why Observer Design Pattern?

* The **Channel (Subject)** does not need to know details about subscribers.
* Subscribers just implement the Observer interface to receive updates.
* New types of observers can be added easily (e.g email alerts, mobile notifications).
* Supports **loose coupling** between the publisher (channel) and consumers (subscribers).


## File Explanations

**1. client/YouTubeApp.java**

* Demonstrates the system.
* Creates a channel and subscribers.
* Shows subscription, unsubscription, and video upload notifications.

**2. observer/Observer.java**

* Defines the Observer interface.
* Declares update() method for receiving notifications.

**3. observer/Subscriber.java**

* Concrete implementation of Observer.
* Each subscriber has a username and receives video upload notifications.

**4. subject/Subject.java**

* Defines the Subject interface.
* Declares methods to add, remove, and notify observers.

**5. subject/Channel.java**

* Concrete implementation of Subject.
* Stores channel name and list of subscribers.
* When a new video is uploaded, notifies all subscribed users.

