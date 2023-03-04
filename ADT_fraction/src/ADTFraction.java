class ADTFraction {
    private int n;
    private int d;

    public ADTFraction() { //default constructor
        this.n = 0;
        this.d = 1;
    }

    public ADTFraction(int a, int b) { //parameter constructor
        if (b != 0) {
            this.n = a;
            this.d = b;
        } else {
            this.n = 0;
            this.d = 1;
            System.out.println("Denominator doesn't be 0. Default value assigned");
        }
    }

    public void set(int a, int b) { //set numerator and denomenator
        if (b != 0) {
            this.n = a;
            this.d = b;
        } else {
            System.out.println("Denominator can not be zero. Value setting terminated");
        }
    }

    public ADTFraction plus(ADTFraction x) {//add two fractions
        int num, dem;
        num = this.n * x.d + this.d * x.n;
        dem = this.d * x.d;
        return new ADTFraction(num, dem);
    }

    // method overloading has used in here for times() functions
    public ADTFraction times(int a) {//multiply fraction by a number
        return new ADTFraction(a * this.n, this.d);
    }

    public ADTFraction times(ADTFraction x) {//multiply two fractions
        return new ADTFraction(x.n * this.n, this.d * x.d);
    }

    public ADTFraction reciprocal() {//reciprocal of a fraction
        return new ADTFraction(this.d, this.n);
    }

    public float value() {//numerical value of a fraction
        return (float)this.n / this.d;
    }

    public void display() {//display the fraction in the format n/d
        System.out.println("Fraction : " + this.n + " / " + this.d);
    }

    public void refine() {//set the instance to its minimum fraction
        for (int i = this.n; i >= 2; i--) {
            if (this.n % i == 0 && this.d % i == 0) {
                this.n = this.n / i;
                this.d = this.d / i;
            }
        }
    }

}