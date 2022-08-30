# Chapter 4 - Servers (Hardware installetion)

## Difference between clients and servers

- Dependencies: other computers and users depend on the servers
- Cost: more cost in purchase and maintenance
- Usage: typically specialized for some services

## Three hardware-markets

1. Home market
2. Server market
3. Business market

_1 & 2: desktop machines, 3: usually rack mounted_

## Choosing hardware

### 1. Standard off the shelfs

- Cheap
- Low threshold for changing equipment
- Can buy more units

### 2. Special purpose server hardware

- Reliability and high quality
- Redundant solutions built in
- Better monitoring
- Error correction

### What is best practice?

- Different strategies
- Google looked into it and desided to buy cheap hardware. If it fails the hardware could just be
  disconnected.

## Service strategies

Strategies to apply when servers fails:

- Over-capasity: order spare parts when needed
- Local spare parts: some locally but not everything
- Spare kits: almost complete machines
- Spare machines: complete, ready to run
- Designated technician: in close contact
- Resident technician: at office
- Out-sourcing: somebody else worry about it

**Out-sourcing is most common now-a-days**

## Maintenance: reactivity or proactivity

### Pro-activity

- Try to avoid problems, with monitoring, redundancy, and regulary checks making sure everything works as intended.

### Re-activity

- Wait til problems accure, then fix it.
- If it aint broke, dont fix it :)

## Some points about server

- Backup: valuable data
- Location: ergonomy, cooling, power, network
- Choice of OS: must fit the usage
- Remote administration: console servers
- Access: restricted

_**Example of redundancy:** Nasa space rockets usually have 4 computers computing the same tasks to avoid mistakes caused by bit-flips_

# Chapter 5 - Services

## Definition

Services are continually running programs which offer a **standarized functionality**, based on a protocol to users and client programs, usually over the network

## User's needs

- How will the service be used
- Important vs useful functionality
- Who are the users
- How critical is the funcionality
- What are the needs for availability and capacity
- What are the needs for support

## SLA - Service Level Agreement

- Defined the service
- Specifies the service level
  - Availability
  - Performance
  - Support
- Response time for various problems
- Rules of escalation
- Bonus, malu,s pricelist for extra work

# Virtualization

- Virtual memory, starting step for virtualization

- VMware layer directly over the hardware layer -> Can the have many OS layers (each with application layers on top) on top of the VMware layer. _Ref image from slides_

## Advantages

- Better resource utilization
  - Reduced need for physical machines
  - Less costs for electricity, cooling and space
- Increased uptime
  - migration
  - service on parts of the hardware without stopping the VMs
- Fast scaling
- Better opportunities for testing and training
  - quick and easy set up servers for test, training etc

## Disadvantages

- Increased complexity
  - specialiezed server
  - must be treated as a pet
- Increased need for competence
  - several subjext areas in rapid development
  - new paradigms
