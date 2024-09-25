#include<stdio.h>
#include<stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

// Function to create a new node
struct Node *newNode(int data) {
    struct Node *node = (struct Node *)malloc(sizeof(struct Node));
    node->data = data;
    node->next = NULL;
    return node;
}

// Function to insert a new node at the end
void insertAtEnd(struct Node **head, int data) {
    struct Node *newNode;
    newNode->data=data;
    if (*head == NULL) {
        *head = newNode;
        return;
    }
    struct Node *temp = *head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newNode;
}

// Function to insert a new node at a specific position
void insertAtPosition(struct Node **head, int data, int position) {
    struct Node *newNode;
    newNode->data=data;
    if (position == 1) {
        newNode->next = *head;
        *head = newNode;
        return;
    }
    struct Node *temp = *head;
    for (int i = 1; i < position - 1; i++) {
        if (temp == NULL) {
            printf("Invalid position\n");
            return;
        }
        temp = temp->next;
    }
    newNode->next = temp->next;
    temp->next = newNode;
}

// Function to delete a node from the beginning
void deleteFromBeginning(struct Node **head) {
    if (*head == NULL) {
        return;
    }
    struct Node *temp = *head;
    *head = temp->next;
    free(temp);
}

// Function to delete a node from the end
void deleteFromEnd(struct Node **head) {
    if (*head == NULL) {
        return;
    }
    if ((*head)->next == NULL) {
        free(*head);
        *head = NULL;
        return;
    }
    struct Node *temp = *head;
    while (temp->next->next != NULL) {
        temp = temp->next;
    }
    free(temp->next);
    temp->next = NULL;
}

// Function to delete a node from a specific position
void deleteAtPosition(struct Node **head, int position) {
    if (*head == NULL) {
        return;
    }
    if (position == 1) {
        deleteFromBeginning(head);
        return;
    }
    struct Node *temp = *head;
    for (int i = 1; i < position - 1; i++) {
        if (temp == NULL || temp->next == NULL) {
            printf("Invalid position\n");
            return;
        }
        temp = temp->next;
    }
    struct Node *toDelete = temp->next;
    temp->next = toDelete->next;
    free(toDelete);
}

// Function to print the linked list
void printList(struct Node *head) {
    while (head != NULL) {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}

int main() {
    struct Node *head = NULL;

    // Inserting nodes at the end
    insertAtEnd(&head, 1);
    insertAtEnd(&head, 2);
    insertAtEnd(&head, 3);
    printf("List after insertion at the end: ");
    printList(head);

    // Inserting a node at a specific position
    insertAtPosition(&head, 4, 2);
    printf("List after insertion at position 2: ");
    printList(head);

    // Deleting a node from the beginning
    deleteFromBeginning(&head);
    printf("List after deletion from the beginning: ");
    printList(head);

    // Deleting a node from the end
    deleteFromEnd(&head);
    printf("List after deletion from the end: ");
    printList(head);

    // Deleting a node from a specific position
    deleteAtPosition(&head, 2);
    printf("List after deletion from position 2: ");
    printList(head);

    return 0;
}

