# Introduction to Arrays & ArrayLists

## Why do we need an Array?
- store more than one values/data in a single variable
- collection primitive datatypes or objects

## Syntax
- datatype[] vaiableName = new datatype[size];
- ex: store 5 rollnos
```
int[] rollNos = new int[5];
```
or directly
```
int[] rollNos = {1,2,3,4,5};
```

# int[] rollNos --> decleration of Array
- rollNos is getting defined in the stack

# new int[] --> initialisation of Array
- object is being created in the heap

# Note
- array objects are stored in heap
- heap object are not continous
- dynamic memory allocation
- indexing start from 0 to n-1 (n is size of array)
- rollNos is initialised with default values

## Default Values
int - 0
String - null
float - 0.0
boolean - false
object - null

## Acessing elements of an Array
- arr[index]

## 3 ways to print Array
- using for loop
- using for each loop
- using Array.toString(arr) method

# 2-D Arrays 
- int[][] arr = new int[3][4];
or
- int[][] arr = {
    {1,2,3,4},
    {1,2,3,4},
    {1,2,3,4},
};

- rowSize = arr.length
- colSize = arr[0].lenght

## Take input
```
for(int i=0; i<rowSize; i++){
    for(int j=0; j<colSize; i++){
        arr[i][j] = sc.nextInt();
    }
}
```

## Print 2-D Array
```
for(int i=0; i<rowSize; i++){
    for(int j=0; j<colSize; i++){
        System.out.print(arr[i][j]);
    }
    System.out.println();
}
```
or
```
for(int i=0; i<rowSize; i++){
    System.out.println(Arrays.toString(arr[i]));
}
```
or
```
for(int[] a : arr){
    System.out.println(Arrays.toString(a));
}
```

# ArrayList
- array with no fixed size

## Syntax
```
ArrayList<Integer> list = new ArrayList<>();
```

```
list.add(10);
list.add(10);
list.add(10);
list.add(10);
list.add(10);
list.add(1, 50);
list.contains(10);

list.remove(1);
list.get(1);

System.out.println(list);
```


