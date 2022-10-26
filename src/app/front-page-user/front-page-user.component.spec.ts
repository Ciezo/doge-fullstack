import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FrontPageUserComponent } from './front-page-user.component';

describe('FrontPageUserComponent', () => {
  let component: FrontPageUserComponent;
  let fixture: ComponentFixture<FrontPageUserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FrontPageUserComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FrontPageUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
