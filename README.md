# Hive-javaUDF-ConvertDateFormat

Open `Hive Shell`

**Step 1**

```hive
hive> ADD JAR <path-of-the-JAR-file>
```
**Step 2**

```hive
hive> CREATE TEMPORARY FUNCTION DateConverter  AS 'com.ibm.logic.HiveUDF';
```

*Testing*

select DateConverter("160627","yyMMdd");

select DateConverter('062716','MMddyy');
