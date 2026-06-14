This is the Readme of my Project.
# File Compression System

## Overview

The File Compression System is a Java-based console application that compresses and decompresses text data using the Run-Length Encoding (RLE) technique. It reduces the size of repetitive data by storing characters along with their occurrence count and can also restore the original data through decompression.

## Features

* Compress strings using Run-Length Encoding (RLE)
* Decompress compressed strings back to original form
* Menu-driven user interface
* Simple and efficient compression technique
* Easy-to-use console application

## Technologies Used

* Java
* Scanner Class for User Input
* Object-Oriented Programming (OOP)

## Classes Used

### 1. CompressionService (Interface)

Defines the following methods:

* compress(String data)
* decompress(String data)

### 2. FileCompressor Class

Implements the CompressionService interface.

Functions:

* Compresses input strings using Run-Length Encoding
* Decompresses compressed strings back to their original form

### 3. FileCompressionApp Class

Contains the main method and provides a menu-driven interface for users to perform compression and decompression operations.

## Working Process

1. The user selects an option from the menu.
2. For compression, the user enters a string.
3. The program compresses the string using Run-Length Encoding.
4. For decompression, the user enters a compressed string.
5. The program restores the original string.
6. The process continues until the user chooses to exit.

## Sample Output

--- FILE COMPRESSION MENU ---

1. Compress String
2. Decompress String
3. Exit

Enter choice: 1

Enter string: aaabbbcc

Compressed: a3b3c2

Enter choice: 2

Enter compressed string: a3b3c2

Decompressed: aaabbbcc

## OOP Concepts Used

* Interface
* Classes and Objects
* Abstraction
* Method Overriding
* Encapsulation

## Advantages

* Reduces storage space for repetitive data
* Simple compression algorithm
* Easy to understand and implement
* Fast compression and decompression process
* User-friendly menu-driven interface

## Conclusion

This project demonstrates the implementation of a File Compression System using Java and Run-Length Encoding (RLE). It provides an efficient way to compress repetitive data and recover the original information through decompression while showcasing important Object-Oriented Programming concepts.

