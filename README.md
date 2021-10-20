# Console Multiplication Table Application

In a nutshell, the program should work as follows:
- Create a tabular form with given width and height and provide information of vertical or horizontal multiplication of numbers
- Quit

## Commands

| COMMAND | DESCRIPTION |
| ------ | ------ |
| T w h | Create multiplication table of width w and height h. |
| Q | Should quit the program. |


## Features

- Commands are case insensitive. Can use lower/upper letters

## Constraints

- width (w) should be 0 < w <= 1000
- height (h) should be 0 < h <= 1000

## Sample I/O

Below is a sample run of the program. User input is prefixed with enter command:

```sh
enter command: T 5 5
*  | 1| 2| 3| 4| 5|
===================
1->| 1| 2| 3| 4| 5|
-------------------
2->| 2| 4| 6| 8|10|
-------------------
3->| 3| 6| 9|12|15|
-------------------
4->| 4| 8|12|16|20|
-------------------
5->| 5|10|15|20|25|
```

```sh
enter command: Q
exit from the application
```

## Tech

- [Maven] - Simple maven project
- [Java 1.8] - Used java for logic build

## Installation

Setup project as maven project in your favourite IDE. Or download zip file and do maven build

```sh
mvn clean install package
```

Jar file "console-multiplication-table-app-1.0.0.jar" will be created in target folder
Navigate to the target folder and run below command to start using application

```sh
java -jar console-multiplication-table-app-1.0.0.jar
```

## License

MIT
