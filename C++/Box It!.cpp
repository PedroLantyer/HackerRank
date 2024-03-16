#include <iostream>

class Box
{
    private:
        int length, breadth, height;
    public:
        Box()
        {
            length = 0, breadth = 0, height = 0;
        }
        Box(int l, int b, int h)
        {
            length = l, breadth = b, height = h;
        }
        int get_length()
        {
            return length;
        }
        int get_breadth()
        {
            return breadth;
        }
        int get_height()
        {
            return height;
        }
        long long CalculateVolume()
        {
            long long volume = length*breadth*height;
            return volume;
        }
};

int main() {
    Box b1;
    Box b2(2,3,4);
    return 0;
}
