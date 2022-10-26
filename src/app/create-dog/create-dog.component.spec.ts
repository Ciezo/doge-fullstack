import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateDogComponent } from './create-dog.component';

describe('CreateDogComponent', () => {
  let component: CreateDogComponent;
  let fixture: ComponentFixture<CreateDogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateDogComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateDogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
