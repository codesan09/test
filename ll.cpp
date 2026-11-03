# include<iostream>

using namespace std;

class node{
    public:

    int data;
    node* next;

    node(int val){
        data = val;
        next = nullptr;
    }
};

int main()
{
    node* head = new node(1);

    head->next = new node(2);
    head->next->next = new node(3);


    return 0;
}