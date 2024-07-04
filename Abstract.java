// Immutable class: extends -> Normal Inheritance, implements -> Interface Inheritance
public class Rational extends Number implements Comparable<Rational> {

// Data Fields
private long numerator = 0;
private long denominator = 1;

// Constructors
/** Construct a Rational with default properties */
public Rational() {
this(0, 1);
}

/** Construct a Rational with specified numerator and denominator */
public Rational(long numerator, long denominator) { // (4/ 12) -> (1 / 3)
long gcd = gcd(numerator, denominator);
this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
this.denominator = Math.abs(denominator) / gcd;
}

private static long gcd(long n, long d) { // (4 / 12)

long n1 = Math.abs(n);
long n2 = Math.abs(d);
int gcd = 1;

for(int k = 1; k <= n1 && k <= n2; k++) {
if(n1 % k == 0 && n2 % k == 0) {
gcd = k;
}
}

return gcd;

}


// Getters and Setters
public long getNumerator() {
return numerator;
}

public long getDenominator() {
return denominator;
}

@Override
public int intValue() {
return (int)doubleValue();
}

@Override
public long longValue() {
return (long)doubleValue();
}

@Override
public float floatValue() {
return (float)doubleValue();
}

@Override
public double doubleValue() { //(1 / 3) -> 0.3333333..
return numerator * 1.0 / denominator;
}

@Override
public int compareTo(Rational secondRational) { // (5 / 12)
if(this.subtract(secondRational).getNumerator() > 0) {
return 1;
} else if(this.subtract(secondRational).getNumerator() < 0) {
return -1;
} else {
return 0;
}
}

@Override
public String toString() {
if(denominator == 1) {
return numerator + "";
} else
return numerator + "/" + denominator;
}

// Custom Methods
/**
* Addition - (a/b) + (c/d) -> (ad + bc) / bd
*/
public Rational add(Rational secondRational) {
long n = numerator * secondRational.getDenominator() +
denominator * secondRational.getNumerator();
long d = denominator * secondRational.getDenominator();
return new Rational(n, d);
}

/**
* Substraction - (a/b) - (c/d) -> (ad - bc) / bd
*/
public Rational subtract(Rational secondRational) {
long n = numerator * secondRational.getDenominator() -
denominator * secondRational.getNumerator();
long d = denominator * secondRational.getDenominator();
return new Rational(n, d);
}

/**
*Multiplication - (a/b) * (c/d) -> ac / bd
*/
public Rational multiply(Rational secondRational) {
long n = numerator * secondRational.getNumerator();
long d = denominator * secondRational.getDenominator();
return new Rational(n, d);
}

/**
* Division - (a/b) + (c/d) -> ad / bc
*/
public Rational divide(Rational secondRational) {
long n = numerator * secondRational.getDenominator();
long d = denominator * secondRational.getNumerator();
return new Rational(n, d);
}
}