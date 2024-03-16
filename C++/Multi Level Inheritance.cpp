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
};

class Equilateral : public Isosceles
{
    public:
        void equilateral()
        {
            printf("I am an equilateral triangle\n");
        }
};

int main() {
    Equilateral eq;
    eq.equilateral();
    eq.isosceles();
    eq.triangle();
    return 0;
}
