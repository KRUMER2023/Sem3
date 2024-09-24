#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
} Node;

Node* createNode(int data)
{
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}

Node* insert(Node* root, int data)
{
    if (root == NULL)
    {
        return createNode(data);
    }
    if (data < root->data)
    {
        root->left = insert(root->left, data);
    }
    else if (data > root->data)
    {
        root->right = insert(root->right, data);
    }
    return root;
}

Node* search(Node * root,int data)
{
    if(root==NULL||root->data==data)
        return root;
    if(data<root->data)
        return search(root->left,data);
    return search(root->right,data);
}

Node*findMin(Node * root)
{
    while(root->left!=NULL)
    {
        root=root->left;
    }
    return root;
}

Node* deleteNode(Node * root,int data)
{
    if(root==NULL)
        return root;
    if(data<root->data)
        root->left=deleteNode(root->left,data);
    else if(data>root->data)
        root->right=deleteNode(root->right,data);
    else
    {
        if(root->left==NULL)
        {
            Node*temp=root->right;
            free(root);
            return temp;
        }
        else if(root->right==NULL)
        {
            Node*temp=root->left;
            free(root);
            return temp;
        }
        Node*temp=findMin(root->right);
        root->data=temp->data;
        root->right=deleteNode(root->right,temp->data);
    }
    return root;
}

void inorder(Node*root)
{
    if(root!=NULL)
    {
        inorder(root->left);
        printf("%d ",root->data);
        inorder(root->right);
    }
}

void preOrderTraversal(Node* node)
{
    if (node == NULL)
        return;

    printf("%d ", node->data);
    preOrderTraversal(node->left);
    preOrderTraversal(node->right);
}

void postorder(Node *root)
{
    if(root == NULL)
        return;

    postorder(root->left);


    postorder(root->right);

    printf("%d ",root->data);
}

int main()
{
    Node * root=NULL;

    root=insert(root,50);
    root=insert(root,30);
    root=insert(root,20);
    root=insert(root,40);
    root=insert(root,70);
    root=insert(root,60);
    root=insert(root,80);

    printf("In-order traversal:");
    inorder(root);
    printf("\n\n");


    printf("Pre-Order traversal:");
    preOrderTraversal(root);
    printf("\n\n");

    printf("Post-Order traversal:");
    postorder(root);
    printf("\n\n");

    Node* searchResult=search(root,40);
    if(searchResult!=NULL)
        printf("Element 40 found in the BST.\n");
    else
        printf("Element 40 not found in the BST.\n");


    root=deleteNode(root,20);
    printf("In-order traversal after deleting  20 : ");
    inorder(root);
    printf("\n");

    printf("Pre-Order traversal after deleting  20 : ");
    preOrderTraversal(root);
    printf("\n\n");

    printf("Post-Order traversal after deleting  20 : ");
    postorder(root);
    printf("\n\n");

    return 0;
}
