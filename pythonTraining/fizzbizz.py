
call_of_3='Fizz'
call_of_5='Bizz'
call_of_15='Fizz Buzz'

max=int(input('input max num -> '))
for count in range(1,max+1,1):
    if count % 3 == 0 and count % 5 == 0:
        print(call_of_15)
        continue
    if count % 3 == 0:
        print(call_of_3)
        continue
    if count % 5 == 0:
        print(call_of_5)
        continue
    print(count)
