#include <iostream>

class Object {
public:
   virtual double getDouble();
};

class Integer : public Object {
public:
    Integer(int number);
   Object* sub(Object* o);
   double getDouble();
private:
    int number;
};

int main() {
    
    Object* varname1 = new Object();
      varname1=((new Integer(3))->sub(new Integer(4)));

std::cout << "Test" << varname1->getDouble();
    return 0;
}

Integer::Integer(int n)
{
 number = n;   
}

Object* Integer::sub(Object* o) {
    number = (int) (number - o->getDouble());
    return this;
}

double Integer::getDouble() {
    std::cout << "getdouble" << number;
    return number;
}

double Object::getDouble() {
    return 0;
}

