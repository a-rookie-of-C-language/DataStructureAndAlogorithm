cmake_minimum_required(VERSION 3.28)
project(Stack)

set(CMAKE_CXX_STANDARD 17)

add_executable(Stack main.cpp
        Stack.h
        Stack.cpp
        uion.cpp
        uion.h)
