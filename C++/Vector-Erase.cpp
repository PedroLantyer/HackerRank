#include <vector>
#include <iostream>
#include <algorithm>


int main() {
    int n,x;
    std::cin >> n;
    std::vector<int> vect1;
    for (int i = 0; i < n; i++)
    {
        std::cin >> x;
        vect1.push_back(x);
    }  
    
    int a,b,c;
    std::cin >> a >> b >> c;
    vect1.erase(vect1.begin()+(a-1));
    vect1.erase(vect1.begin()+(b-1),vect1.begin()+(c-1));
    
    int length;
    length = vect1.size();
    std::cout << length << std::endl;
    for(int i = 0; i < length; i++)
    {
        if (i != (length-1))
        {
            std::cout << vect1[i] << " ";
        }
        else
        {
            std::cout << vect1[i] << std::endl;
        }
    }
    return 0;
}
