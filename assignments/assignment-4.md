# Assignment 1

# Notes from task 3

To create the same infrastructure as in assignment 2 you need:

- A network
  - With a subnet for floating IP
- A key pair
- A VM running on a compute resource (m1.small, m1.medium, etc..)

## Definition code

```
heat_template_version: 2021-04-16

description: Template to deploy a VM with floating IP

resources:
  my_net:
    type: OS::Neutron::Net

  my_subnet:
    type: OS::Neutron::Subnet
    properties:
      network_id: { get_resource: my_net }
      cidr: 192.168.0.0/24
      ip_version: 4

  my_key:
    type: OS::Nova::KeyPair
    properties:
      save_private_key: true
      name: my_key

  instance_port:
    type: OS::Neutron::Port
    properties:
      network: { get_resource: my_net }
      fixed_ips:
        - subnet_id: { get_resource: my_subnet }

  my_instance:
    type: OS::Nova::Server
    properties:
      key_name: { get_resource: my_key }
      image: fe8be799-21f4-489a-9e3f-9b8a2e15c015 # Ubuntu Server 20.04 amd64
      flavor: m1.small
      networks:
        - port: { get_resource: instance_port }

outputs:
  instance_ip:
    description: The IP address of the deployed MV
    value: { get_attr: [my_instance, first_address] }
  private_key:
    description: Private key
    value: { get_attr: [my_key, private_key] }
```

## Stack resource list

![Stack resource list](img/mystack-resource-list.PNG)

## Commands for stopping & deleting stack

**Stopping:** ???

```
openstack stack stop stackname ???
```

**Delete:**

```
openstack stack delete stackname
```