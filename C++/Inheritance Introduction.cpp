#include <iostream>

class Triangle
{
    public:
        void triangle()
        {
            printf("I am a triangle\n");
        }
};

class Isosceles : public Triangle
{
    public:
        void isosceles()
        {
            printf("I am an isosceles triangle\n");
        }
        void get_description()
        {
            printf("In an isosceles triangle two sides are equal\n");
        }
};

int main() {
    Isosceles isc;
    isc.isosceles();
    isc.get_description();
    isc.triangle();
    return 0;
}
