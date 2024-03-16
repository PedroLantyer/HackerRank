#include<iostream>
#include<vector>

class Student
{
    private:
        std::vector<int> scores = {0,0,0,0,0};
    public:
        void get_input()
        {
            for(int i = 0; i < 5; i++)
            {
                std::cin >> scores[i];
            }
        }
        int calculateTotalScore()
        {
            int sum = 0;
            for(int i = 0; i < (int)scores.size();i++)
            {
                sum += scores[i];
            }
            return sum;
        }
};


int main() {
    int student_count, kristen_score, score, higher_than_k = 0;
    Student st;
    scanf("%d", &student_count);
    for(int i = 0; i < student_count; i++)
    {
        st.get_input();
        score = st.calculateTotalScore();
        if(i == 0)
        {
            kristen_score = score;
        }
        else
        {
            if(score > kristen_score)
            {
                higher_than_k++;
            }
        }
    }
    printf("%d\n", higher_than_k);
    return 0;
}
