import java.util.Vector; 

 
 
public class Generator { 

private int primeNumber = 0; 
private int generator = 0; 
 
public Generator() { 
super(); 

} 
public Vector createGenerator(int primeNumber){ 
Vector aa = new Vector(); 
int tempGenerator = 0; 
for ( tempGenerator =2 ; tempGenerator boolean valueGenerated = false; 
int[] TempArray = new int[primeNumber - 1]; 
int ReturnModValue = 1; 
for (int tempVal = 1; tempVal < primeNumber; tempVal++) { 



ReturnModValue = getModValue(tempGenerator, primeNumber, 
tempVal,ReturnModValue); 

if(ReturnModValue == 1 && tempVal!=primeNumber-1){ 
break; 
} 

boolean temp = compareValue(TempArray, ReturnModValue , tempVal); 


TempArray[tempVal - 1] = ReturnModValue; 

if (temp == true) { 
break; 
} 

if(tempVal == primeNumber-1 && TempArray[tempVal-1]==1){ 
valueGenerated= true; 
break; 
} 
} 

 
if(valueGenerated==true){ 
aa.addElement(String.valueOf(tempGenerator)); 
break; 
} 
} 
return aa; 
 
} 
public int getModValue(int tempGenerator , int primeNumber, int tempVal, int ReturnModValue){ 
int anu =(ReturnModValue*tempGenerator) % (primeNumber); 
return anu; 
} 
public boolean compareValue(int TempArray[],int ReturnModValue, int tempVal){ 
for ( int i =0 ; i if(TempArray[i] ==ReturnModValue ){ 
return true; 
} 
} 
return false; 
} 

public int createPrimeNumber(int StartNumber , int EndNumber){ 
double x =0; 
while (true){ 
double PrimeNumber =StartNumber+ (EndNumber - StartNumber)*Math.random(); 
int PrimeNumber1 =(int)PrimeNumber; 
//double x = (Math.pow(2,PrimeNumber1-1))%PrimeNumber1; 
x = getTotalModValue(2,PrimeNumber1,PrimeNumber1-1); 
if(x==1){ 
return PrimeNumber1; 
} 
} 

} 
public Vector createPrimeNumberVector(int StartNumber , int EndNumber){ 
Vector aa = new Vector(); 
double x =0; 
double y =0; 
double xfinal =0; 
int ans =0; 
for ( int i =StartNumber ; i<=EndNumber ; i++){ 
// int index = i/1000; 
// x = (Math.pow(2,1000))%i; 
// y = (Math.pow(2,i-1-(index*1000)))%i; 
// xfinal =Math.pow(x,index); 
// ans = (xfinal*y)%i; 
ans = getTotalModValue(2,i,i-1); 
if(ans==1){ 
aa.addElement(String.valueOf(i)); 
} 
} 
return aa; 
} 
public int getTotalModValue(int tempGenerator , int modNumber, int power){ 
int ReturnModValue = 1; 
for(int i =0;i < power; i++){ 
ReturnModValue =(ReturnModValue*tempGenerator) % (modNumber); 
} 
return ReturnModValue; 
} 
public void setPrimeNumber(int primeNumber){ 
this.primeNumber = primeNumber; 
} 
public void setGenerator(int generator){ 
this.generator = generator; 
} 
public int getPrimeNumber(){ 
return primeNumber; 
} 
public int getGenerator(){ 
return generator; 
} 
public void initializeGenerator(int generator,int primeNumber){ 
setPrimeNumber(primeNumber); 
setGenerator(generator); 
} 
} 