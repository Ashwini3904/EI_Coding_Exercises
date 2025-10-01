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


## Output Screenshot

<img width="353" height="194" alt="output_ss_observer" src="https://github.com/user-attachments/assets/e62b7710-757d-40d7-9457-3fca75f8e50f" />
