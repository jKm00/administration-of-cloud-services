# Security in Cloud Service

**Swish cheese:** Start with a secure firewall. More and more functionallity is needed, hence the firewall gets opened more and more, leaving holes that can be exploited.

## Lifecycle of VM's

1. Starts out with a template/image (Linux distrubution)
   - ISO files
2. Install files you need to run the tasks you are gonna run
   - ngnix for web servers, etc...
   - carefull about "privilaged users" in the packages you install

# Containers

Needs servers to run on

**Wikipedia:** OS paradigm in which the kernel allows the existence of multiple isolated user space instances

## User Space vs Kernel

User space cannot access hardware directly. Have to use system-calls

## View from program

**With out container**, the program can see all the resources. The resources are however guarded by the system-calls

**With container**, you allocate the resource within the container and only these resources are available for the program.

## Container vs. Processes

Each container is running just one process

## Containers vs. VMs

Each VM needs its own _guest OS_. Containers are isolated, like a VM, but share the OS.

_Ref picture from slides_

## Why use containers

- Light weight
- Scaling
- Load balancing

## Kubernetes

Open-source container-orchestration system for

- automating compute application deployment
- scaling
- management
