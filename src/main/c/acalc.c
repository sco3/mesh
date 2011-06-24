#include <stdio.h>
#include <time.h>

int mSize = 49;
int mNum = 11;
unsigned long long mResult = 0;

void recAccomodate(int pos, int level) {
	int i;
	int up = mSize - mNum + 1 + level;
	for (i = pos; i < up; i++) {
		if (mNum > level + 1) {
			recAccomodate(i + 1, level + 1);
		} else {
			mResult++;
		}
	}
}

int main(void) {
	time_t begin;
	time_t end;

	printf ("Number of accomodations of %d elements in %d places.\n", mNum, mSize);

	begin = time(NULL);
	recAccomodate(0, 0);
	end = time (NULL);

	printf ("seconds: %d\n", (end-begin));
	printf("acc number is %ld\n", mResult);
}
