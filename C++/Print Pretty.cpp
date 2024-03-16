#include <iostream>
#include <iomanip> 
using namespace std;

int main() {
	int T; cin >> T;
	cout << setiosflags(ios::uppercase);
	cout << setw(0xf) << internal;
	while(T--) {
		double A; cin >> A;
		double B; cin >> B;
		double C; cin >> C;

        long long A_trunc = A;
        cout << left << nouppercase << showbase << hex << A_trunc << endl;
        cout << right << setw(15) << setfill('_') << showpos << setprecision(2) << fixed << B << endl;
        cout << noshowpos << uppercase << setprecision(9) << scientific << C << endl;

	}
	return 0;

}