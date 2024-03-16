def pow(base, exponent, m):
    result = (base ** exponent)
    modulus = result % m
    return (result, modulus)

if __name__ == "__main__":
    a = int(input())
    b = int(input())
    m = int(input())
    result, modulus = pow(a, b, m)
    print("%d\n%d" % (result, modulus))