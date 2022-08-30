# Administration of Cloud Services

Notes and exercises from administration of cloud services course at NTNU

## Vagrant commands

### Initialize a project

```
vagrant init hashicorpt/bionic64
```

### Installing a box manually

```
vagrant box add hashicorpt/bionic64
```

### Use the box

```
Vagrant.configure("2") do |config|
  config.vm.box = "hashicorpt/bionic64"
  # config.vm.box_version = "1.0.282"
  # config.vm.box_url = "url..."
end
```

### Boot up VM

```
vagrant up
```

### SSH into VM

```
vagrant ssh
```

### Go out of VM

```
logout
```

### Teardown an environment

1. **Suspend**: saves its current running state. Still use disk space while suspended, and requires additional disk space to store the state of the VM

```
vagrant suspend
```

2. **Halt**: Shut down the guest operating system and power down the guest machine. Preserves the contents of disk and allowing to cleanly start it againg.

```
vagrant halt
```

3. **Destroy**: Remove all trace of the guest machine from the system. Stop guest machine, power it down, reclaim its disk space and RAM

```
vagrant destroy
```
