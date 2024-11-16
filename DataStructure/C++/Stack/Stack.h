//
// Created by ergr1 on 2024/11/9.
//
#ifndef STACK_H
#define STACK_H
struct stackNode{
    int data;
    stackNode* next;
};

struct stack{
    stackNode* top;
};

void init(stack* s);
bool isEmpty(stack* s);

stackNode* creatNode();

void push(stack* s, int data);

void pop(stack* s);

int getSize(stack* s);

int getTop(stack* s);

void destroy(stack* s);
#endif //STACK_H
