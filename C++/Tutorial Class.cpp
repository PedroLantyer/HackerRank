#include <iostream>
#include <string>
#include <sstream>

class Student
{
    private:
        int student_age, student_standard;
        std::string student_first_name, student_last_name;
    public:
        void set_age(int age)
        {
            student_age = age;
        }
        int get_age()
        {
            return student_age;
        }
        void set_standard(int standard)
        {
            student_standard = standard;
        }
        int get_standard()
        {
            return student_standard;
        }
        void set_first_name(std::string first_name)
        {
            student_first_name = first_name;
        }
        std::string get_first_name()
        {
            return student_first_name;
        }
        void set_last_name(std::string last_name)
        {
            student_last_name = last_name;
        }
        std::string get_last_name()
        {
            return student_last_name;
        }
        std::string to_string()
        {
            std::stringstream data;
            std::string data_string;
            data << student_age << "," << student_first_name << "," << student_last_name << "," << student_standard;
            data >> data_string;
            return data_string;
        }
};

int main() {
    int age, standard;
    std::string first_name, last_name;
    
    std::cin >> age >> first_name >> last_name >> standard;
    
    Student st;
    st.set_age(age);
    st.set_standard(standard);
    st.set_first_name(first_name);
    st.set_last_name(last_name);
    
    printf("%d\n",st.get_age());
    std::cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
    std::cout << st.get_standard() << "\n";
    printf("\n");
    std::cout << st.to_string();
    
    return 0;
}