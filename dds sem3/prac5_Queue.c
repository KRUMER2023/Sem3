#include <stdio.h>
#include <stdlib.h>

#define MAX 5  // Maximum size of the queue

// Queue structure
struct Queue {
    int items[MAX];
    int front;
    int rear;
};

// Function to create an empty queue
void initializeQueue(struct Queue* q) {
    q->front = -1;
    q->rear = -1;
}

// Function to check if the queue is full
int isFull(struct Queue* q) {
    if (q->rear == MAX - 1) {
        return 1;
    }
    return 0;
}

// Function to check if the queue is empty
int isEmpty(struct Queue* q) {
    if (q->front == -1 || q->front > q->rear) {
        return 1;
    }
    return 0;
}

// Function to add an element to the queue (enqueue)
void enqueue(struct Queue* q, int value) {
    if (isFull(q)) {
        printf("Queue is full! Cannot enqueue %d\n", value);
        return;
    }
    if (q->front == -1) {
        q->front = 0;  // Set front to 0 if the queue was previously empty
    }
    q->rear++;
    q->items[q->rear] = value;
    printf("Enqueued %d\n", value);
}

// Function to remove an element from the queue (dequeue)
int dequeue(struct Queue* q) {
    if (isEmpty(q)) {
        printf("Queue is empty! Cannot dequeue.\n");
        return -1;
    }
    int dequeuedItem = q->items[q->front];
    q->front++;

    // Reset front and rear if the queue becomes empty
    if (q->front > q->rear) {
        q->front = -1;
        q->rear = -1;
    }

    return dequeuedItem;
}

// Function to get the element at the front of the queue
int front(struct Queue* q) {
    if (isEmpty(q)) {
        printf("Queue is empty!\n");
        return -1;
    }
    return q->items[q->front];
}

// Function to get the element at the rear of the queue
int rear(struct Queue* q) {
    if (isEmpty(q)) {
        printf("Queue is empty!\n");
        return -1;
    }
    return q->items[q->rear];
}

// Main function to demonstrate the queue operations
int main() {
    struct Queue q;
    initializeQueue(&q);

    enqueue(&q, 10);
    enqueue(&q, 20);
    enqueue(&q, 30);
    enqueue(&q, 40);
    enqueue(&q, 50);
    enqueue(&q, 60);  // This should trigger the "Queue is full" message

    printf("Front element: %d\n", front(&q));
    printf("Rear element: %d\n", rear(&q));

    printf("Dequeued element: %d\n", dequeue(&q));
    printf("Dequeued element: %d\n", dequeue(&q));

    printf("Front element: %d\n", front(&q));
    printf("Rear element: %d\n", rear(&q));

    return 0;
}
