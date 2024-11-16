//
// Created by ergr1 on 2024/11/9
#include "Stack.h"
#include <iostream>
#include "cstdlib"

void init(stack* s){
    s->top = nullptr;
}

bool isEmpty(stack* s){
    return s->top == nullptr;
}

struct stackNode* creatNode(){
    auto* cur = (stackNode*)malloc(sizeof(struct stackNode));
    cur->next = nullptr;
    return cur;
}

void push(stack* s, int data){
    stackNode* cur = creatNode();
    cur->data = data;
    if (isEmpty(s)){
        s->top = cur;
    }
    else{
        cur->next = s->top;
        s->top = cur;
    }
}

void pop(stack* s){
    stackNode* temp = s->top->next;
    free(s->top);
    s->top = temp;
}

int getSize(stack* s){
    int count = 0;
    for (stackNode* cur = s->top; cur; cur = cur->next){
        count++;
    }
    return count;
}

int getTop(stack* s){
    return s->top->data;
}

void destroy(stack* s){
    if (isEmpty(s)){
        return;
    }
    while (s){
        pop(s);
    }
}
