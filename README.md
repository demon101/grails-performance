# grails-performance

https://github.com/grails/grails-core/issues/640

siege -c 100 -b -r 200  http://localhost:8080/index/index/1

## Grails 3.2.6:

```
Transactions:		       20000 hits
Availability:		      100.00 %
Elapsed time:		       11.95 secs
Data transferred:	       29.18 MB
Response time:		        0.06 secs
Transaction rate:	     1673.64 trans/sec
Throughput:		        2.44 MB/sec
Concurrency:		       97.65
```

## Grails 3.2.6 + groovy 2.4.8

```
Transactions:		       20000 hits
Availability:		      100.00 %
Elapsed time:		       12.08 secs
Data transferred:	       29.18 MB
Response time:		        0.06 secs
Transaction rate:	     1655.63 trans/sec
Throughput:		        2.42 MB/sec
Concurrency:		       97.89
```

## Grails 3.1.15

```
Transactions:		       20000 hits
Availability:		      100.00 %
Elapsed time:		       12.51 secs
Data transferred:	       29.18 MB
Transaction rate:	     1598.72 trans/sec
Throughput:		        2.33 MB/sec
Concurrency:		       96.71
```

## grails 3.1.15 + groovy 2.4.8

```
Transactions:		       20000 hits
Availability:		      100.00 %
Elapsed time:		       11.71 secs
Data transferred:	       29.18 MB
Transaction rate:	     1707.94 trans/sec
Throughput:		        2.49 MB/sec
Concurrency:		       97.71
```

## grails 3.1.15 + Interceptor

```
Transactions:		       20000 hits
Availability:		      100.00 %
Elapsed time:		       11.96 secs
Data transferred:	       29.18 MB
Response time:		        0.06 secs
Transaction rate:	     1672.24 trans/sec
Throughput:		        2.44 MB/sec
Concurrency:		       96.49
```

## grails 3.1.15 + Interceptor + java 8.121

```
Transactions:		       20000 hits
Availability:		      100.00 %
Elapsed time:		       12.07 secs
Data transferred:	       29.18 MB
Response time:		        0.06 secs
Transaction rate:	     1657.00 trans/sec
Throughput:		        2.42 MB/sec
Concurrency:		       97.29
```

## grails 2.4.5 + java 8.121

```
Transactions:		       20000 hits
Availability:		      100.00 %
Elapsed time:		        8.67 secs
Data transferred:	       16.59 MB
Response time:		        0.04 secs
Transaction rate:	     2306.81 trans/sec
Throughput:		        1.91 MB/sec
Concurrency:		       96.01
```

