<div align="">
  
## Check this simple note before you do anything with this concept.
#### Let's create the logic for the pattern, from 0 to 4. In the following code snippet, we are starting row and column value from 0.
```java
int row = 4;
for(int i=0; i<row; i++)   
{   
for(int j=0; j<=i; j++)   
{   
System.out.print("* ");   
}   
System.out.println(); 
```
#### then the output will be like this
```
*
```

#### if we take i = 1 & j = 1, then the both for loops will change like this
```java
int row = 4;
for(int i=1; i<row; i++)   
{   
for(int j=1; j<=i; j++)   
{   
System.out.print("* ");   
}   
System.out.println(); 
```
#### then the output will be like this
```
*
**
```

#### if we take i = 2 & j = 2, then the both for loops will change like this
```java
int row = 4;
for(int i=2; i<row; i++)   
{   
for(int j=2; j<=i; j++)   
{   
System.out.print("* ");   
}   
System.out.println(); 
```
#### then the output will be like this
```
*
**
***
```

### Now i think you got what im saying in here. If not, just check all the for loops in above examples. Cheers :clinking_glasses:

</div>
