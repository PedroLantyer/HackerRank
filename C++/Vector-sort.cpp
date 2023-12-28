#include <iostream>
#include <vector>
#include <algorithm>


int main() {
    int n,x,length;
    std::vector<int> vect1;

    std::cin >> n;
    for(int i = 0; i < n; i++)
    {
        std::cin >> x;
        vect1.push_back(x);
    }  
    std::sort(vect1.begin(),vect1.end());

    length = vect1.size();
    for (int i = 0; i < length; i++)
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
