#include <vector>
#include <iostream>
#include <sstream>


int main() {
    int x,length;
    char c;
    std::string str1;
    std::cin >> str1;
    std::stringstream ss(str1);
    std::vector <int> vect1;

    while (ss>>x)
    {
        vect1.push_back(x);
        ss >> c; // used to skip the commas == usado pra pular as virgulas
    }

    length = vect1.size();
    for(int i = 0; i < length; i++)
    {
        std::cout << vect1[i] << "\n";
    }
    
    return 0;
}
