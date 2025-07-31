#include "hamming.h"
#include <string.h>

int compute(const char *lhs, const char *rhs) {
  if (strlen(lhs) == strlen(rhs)) {
    int hamming_distance = 0;
    int i;
    for (i = 0; i <= (int)strlen(lhs) - 1; i++) {
      if (lhs[i] != rhs[i]) {
        hamming_distance++;
      }
    }
    return hamming_distance;

  } else {
    return -1;
  }
}
