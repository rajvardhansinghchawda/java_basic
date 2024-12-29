#include <iostream>
using namespace std;
class construct{
    public:
    int area;

    // construct()
    // {
    //     area = 0;
    //     cout<<"area is"<<area;
    // }
    construct(int x, int y){
       // x=1;
       // y =4;
        area = x+y;
        cout<<"area is"<<area;
        
    }
};
int main()
{
    construct(2,3);
   // construct(4, 5);

    return 0;
}


