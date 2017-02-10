# grails-performance

https://github.com/grails/grails-core/issues/640

siege -c 100 -b -r 200  http://localhost:8080/index/index/1

## Grails 3.2.6:

Transactions:		       20000 hits
Availability:		      100.00 %
Elapsed time:		       11.73 secs
Data transferred:	       29.18 MB
Response time:		        0.06 secs
Transaction rate:	     1705.03 trans/sec
Throughput:		        2.49 MB/sec
Concurrency:		       96.52
Successful transactions:       20000
Failed transactions:	           0
Longest transaction:	        0.22
Shortest transaction:	        0.00

## Grails 3.1.15

> Transactions:		       20000 hits
> Availability:		      100.00 %
> Elapsed time:		       12.51 secs
> Data transferred:	       29.18 MB
> Transaction rate:	     1598.72 trans/sec
> Throughput:		        2.33 MB/sec
> Concurrency:		       96.71

## grails 3.1.15 + groovy 2.4.8

> Transactions:		       20000 hits
Availability:		      100.00 %
Elapsed time:		       11.71 secs
Data transferred:	       29.18 MB
Transaction rate:	     1707.94 trans/sec
Throughput:		        2.49 MB/sec
Concurrency:		       97.71

