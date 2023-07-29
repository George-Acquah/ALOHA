# ALOHA
# ALOHA (Pure ALOHA and Slotted ALOHA) Simulator

ALOHA (Aloha) is a random access protocol used in data communication networks to manage multiple devices trying to transmit data over a shared channel. This repository contains a simulator for both Pure ALOHA and Slotted ALOHA protocols written in Java.

## Pure ALOHA

Pure ALOHA is an early version of the ALOHA protocol, where any station can transmit data at any time. However, this unrestricted access leads to frequent collisions when two or more stations transmit simultaneously, resulting in a decrease in overall network efficiency.

The Pure ALOHA simulator in this repository allows you to experiment with different parameters, such as the number of stations, transmission rates, and packet arrival times, to observe how the protocol handles collisions and throughput.

### How to Run Pure ALOHA Simulator  

1. Clone the repository to your local machine:

```bash
git clone https://github.com/George-Acquah/ALOHA_Java.git
``` 
### Compile the Java source files:
```bash 
cd ALOHA_Java/Pure_ALOHA
javac PureALOHASimulator.java
```

### Run the simulator
```bash
java PureALOHASimulator
```

## Slotted ALOHA

Slotted ALOHA is an improved version of the ALOHA protocol, where the time is divided into discrete time slots, and stations are required to transmit only at the beginning of a time slot. This synchronization reduces the probability of collisions and improves network efficiency compared to Pure ALOHA.

The Slotted ALOHA simulator in this repository allows you to explore the effects of various slot sizes, the number of stations, and packet arrival rates on network performance.

### How to Run Slotted ALOHA Simulator
Clone the repository to your local machine: (skip if you've already done this for Pure ALOHA)

```bash
git clone https://github.com/George-Acquah/ALOHA_Java.git
```
### Compile the Java source files:
```bash 
cd ALOHA_Java/Slotted_ALOHA
javac SlottedALOHASimulator.java
```

### Run the simulator
```bash
java SlottedALOHASimulator
```