# Openstack Stack Cheatsheet

## Connect

```
ssh ntnu-username@login.stud.ntnu.no
```

## Authenticate ?

```
source your-openrc-file
```

_Example:_

```
source IDATA2502_H22_joakied-openrc.sh
```

## List stacks

```
openstack stack list
```

## List resources of a stack

```
openstack stack resource list stack-name
```

_Example:_

```
openstack stack resource list MyStack
```

## Delete stack

```
openstack stack delete stack-name
```
