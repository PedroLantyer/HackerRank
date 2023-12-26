#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

std::vector<std::vector<int>> build_vector(int n)
{
    std::vector<std::vector<int>> vect1 = {};
    for (int i = 0;i < n;i++)
    {
        int size;
        std::vector<int> vect2;
        std::cin >> size;
        for (int j = 0; j < size; j++)
        {
            int data;
            std::cin >> data;
            vect2.push_back(data);
        }
        vect1.push_back(vect2);
    }
    return vect1;
}

std::vector<int> get_answers(int questions, std::vector<std::vector<int>> vect1)
{
    std::vector <int> answers;
    for (int i = 0; i < questions; i++)
    {
        int a,b;
        std::cin >> a >> b;
        answers.push_back(vect1[a][b]);
    }
    return answers;
}

void print_answers(std::vector <int> answers)
{
    int answers_size;
    answers_size = answers.size();
    for (int i = 0; i < answers_size; i++)
    {
        std::cout << answers[i] << std::endl;
    }
}
int main() {
    int n,questions;
    std::cin >> n >> questions;
    std::vector<std::vector<int>> vect1 = build_vector(n);
    std::vector <int> answers = get_answers(questions, vect1);
    print_answers(answers);
    return 0;
}