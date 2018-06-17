# Hive-javaUDF-ConvertDateFormat

Open `Hive Shell`

**Step 1**

```
hive> ADD JAR <path-of-the-JAR-file>
```
**Step 2**

```
hive> CREATE TEMPORARY FUNCTION DateConverter  AS 'com.ibm.logic.HiveUDF';
```

*Testing*

```
hive> select DateConverter("160627","yyMMdd");
```
=> `2016-06-27`

```
hive> select DateConverter('062716','MMddyy');
```
=> `2016-06-27`


